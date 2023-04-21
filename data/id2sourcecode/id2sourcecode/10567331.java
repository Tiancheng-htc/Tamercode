    public final void testInvalidationUpdating() throws KNXException, InterruptedException {
        final GroupAddress group1 = new GroupAddress(0, 0, 1);
        final GroupAddress group2 = new GroupAddress(0, 0, 2);
        final GroupAddress group3 = new GroupAddress(0, 0, 3);
        final Configuration c = NetworkBuffer.createConfiguration(lnk, "update/invalidate");
        final DatapointMap map = new DatapointMap();
        final StateDP dp = new StateDP(group1, "group1", 0, "1.001");
        dp.add(group2, false);
        dp.add(group3, true);
        final StateDP dp2 = new StateDP(group2, "group2", 0, "1.001");
        final StateDP dp3 = new StateDP(group3, "group3", 0, "1.001");
        map.add(dp);
        map.add(dp2);
        map.add(dp3);
        c.setDatapointModel(map);
        final StateFilter f = new StateFilter();
        c.setFilter(f, f);
        final ProcessCommunicator init = new ProcessCommunicatorImpl(lnk);
        init.write(dp, "off");
        init.write(dp2, "on");
        init.write(dp3, "on");
        init.detach();
        c.activate(true);
        final ProcessCommunicator pc = new ProcessCommunicatorImpl(c.getBufferedLink());
        final String s1 = pc.read(dp);
        Thread.sleep(50);
        final String s2 = pc.read(dp2);
        assertEquals(s1, pc.read(dp));
        final String s3 = pc.read(dp3);
        assertEquals(s3, pc.read(dp));
        final String write = s3.equals("off") ? "on" : "off";
        pc.write(dp3, write);
        assertEquals(write, pc.read(dp));
        assertEquals(write, pc.read(dp3));
        assertEquals(write, pc.read(dp));
        pc.write(group3, true);
        Thread.sleep(50);
        assertTrue(pc.readBool(group1));
        pc.write(group3, false);
        Thread.sleep(50);
        assertFalse(pc.readBool(group1));
        pc.write(group2, false);
        Thread.sleep(50);
        assertEquals(s1, pc.read(dp));
        pc.write(group2, false);
        Thread.sleep(50);
        assertEquals(s1, pc.read(dp));
        NetworkBuffer.removeBuffer("update/invalidate");
    }