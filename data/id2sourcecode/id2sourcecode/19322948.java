    @Test
    public void test_lookupType_FullSearch_TwoWordsInMiddle() throws Exception {
        URL url = new URL(baseUrl + "/lookupType/sensor+cluster");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/json");
        assertThat(connection.getResponseCode(), equalTo(200));
        assertThat(getResponse(connection), equalTo("[{\"itemTypeID\":29055,\"itemCategoryID\":17,\"name\":\"Capital Gravimetric Sensor Cluster\",\"icon\":\"37_05\"},{\"itemTypeID\":29056,\"itemCategoryID\":9,\"name\":\"Capital Gravimetric Sensor Cluster Blueprint\",\"icon\":\"03_02\"},{\"itemTypeID\":29065,\"itemCategoryID\":17,\"name\":\"Capital Ladar Sensor Cluster\",\"icon\":\"37_07\"},{\"itemTypeID\":29066,\"itemCategoryID\":9,\"name\":\"Capital Ladar Sensor Cluster Blueprint\",\"icon\":\"03_02\"},{\"itemTypeID\":29069,\"itemCategoryID\":17,\"name\":\"Capital Magnetometric Sensor Cluster\",\"icon\":\"37_06\"},{\"itemTypeID\":29070,\"itemCategoryID\":9,\"name\":\"Capital Magnetometric Sensor Cluster Blueprint\",\"icon\":\"03_02\"},{\"itemTypeID\":29095,\"itemCategoryID\":17,\"name\":\"Capital Radar Sensor Cluster\",\"icon\":\"37_08\"},{\"itemTypeID\":29096,\"itemCategoryID\":9,\"name\":\"Capital Radar Sensor Cluster Blueprint\",\"icon\":\"03_02\"},{\"itemTypeID\":21013,\"itemCategoryID\":17,\"name\":\"Capital Sensor Cluster\",\"icon\":\"54_03\"},{\"itemTypeID\":21014,\"itemCategoryID\":9,\"name\":\"Capital Sensor Cluster Blueprint\",\"icon\":\"03_02\"},{\"itemTypeID\":5279,\"itemCategoryID\":7,\"name\":\"F-23 Reciprocal Sensor Cluster Link\",\"icon\":\"03_09\",\"metaLevel\":4},{\"itemTypeID\":11534,\"itemCategoryID\":17,\"name\":\"Gravimetric Sensor Cluster\",\"icon\":\"37_05\"},{\"itemTypeID\":17340,\"itemCategoryID\":9,\"name\":\"Gravimetric Sensor Cluster Blueprint\",\"icon\":\"03_02\"},{\"itemTypeID\":11536,\"itemCategoryID\":17,\"name\":\"Ladar Sensor Cluster\",\"icon\":\"37_07\"},{\"itemTypeID\":17333,\"itemCategoryID\":9,\"name\":\"Ladar Sensor Cluster Blueprint\",\"icon\":\"03_02\"},{\"itemTypeID\":11535,\"itemCategoryID\":17,\"name\":\"Magnetometric Sensor Cluster\",\"icon\":\"37_06\"},{\"itemTypeID\":17345,\"itemCategoryID\":9,\"name\":\"Magnetometric Sensor Cluster Blueprint\",\"icon\":\"03_02\"},{\"itemTypeID\":7895,\"itemCategoryID\":7,\"name\":\"Prototype ECCM I Gravimetric Sensor Cluster\",\"icon\":\"04_10\",\"metaLevel\":4},{\"itemTypeID\":7893,\"itemCategoryID\":7,\"name\":\"Prototype ECCM I Ladar Sensor Cluster\",\"icon\":\"04_10\",\"metaLevel\":4},{\"itemTypeID\":7914,\"itemCategoryID\":7,\"name\":\"Prototype ECCM I Magnetometric Sensor Cluster\",\"icon\":\"04_10\",\"metaLevel\":4},{\"itemTypeID\":7896,\"itemCategoryID\":7,\"name\":\"Prototype ECCM I Omni Sensor Cluster\",\"icon\":\"04_10\",\"metaLevel\":4},{\"itemTypeID\":7892,\"itemCategoryID\":7,\"name\":\"Prototype ECCM I Radar Sensor Cluster\",\"icon\":\"04_10\",\"metaLevel\":4},{\"itemTypeID\":11537,\"itemCategoryID\":17,\"name\":\"Radar Sensor Cluster\",\"icon\":\"37_08\"},{\"itemTypeID\":17336,\"itemCategoryID\":9,\"name\":\"Radar Sensor Cluster Blueprint\",\"icon\":\"03_02\"}]"));
        assertThat(connection.getHeaderField("Content-Type"), equalTo("application/json; charset=utf-8"));
    }