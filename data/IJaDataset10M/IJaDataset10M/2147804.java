package com.swabunga.spell.engine;

import java.io.*;
import java.util.*;

/**
public class SpellDictionaryCachedDichoDisk extends SpellDictionaryDichoDisk {

    public static int hits = 0;

    public static int codes = 0;

    public static final String JAZZY_DIR = ".jazzy";

    public static final String PRE_CACHE_FILE_EXT = ".pre";

    private static int MAX_CACHED = 10000;

    private HashMap suggestionCache = new HashMap(MAX_CACHED);

    private String preCacheFileName;

    private String preCacheDir;

    /**
    public SpellDictionaryCachedDichoDisk(File wordList) throws FileNotFoundException, IOException {
        super((File) wordList);
        loadPreCache(wordList);
    }

    /**
    public SpellDictionaryCachedDichoDisk(File wordList, String encoding) throws FileNotFoundException, IOException {
        super(wordList, encoding);
        loadPreCache(wordList);
    }

    /**
    public SpellDictionaryCachedDichoDisk(File wordList, File phonetic) throws FileNotFoundException, IOException {
        super(wordList, phonetic);
        loadPreCache(wordList);
    }

    /**
    public SpellDictionaryCachedDichoDisk(File wordList, File phonetic, String encoding) throws FileNotFoundException, IOException {
        super(wordList, phonetic, encoding);
        loadPreCache(wordList);
    }

    /**
    public void addWord(String word) {
        System.err.println("error: addWord is not implemented for SpellDictionaryCachedDichoDisk");
    }

    /**
    public void clearCache() {
        suggestionCache.clear();
    }

    /**
    public List getWords(String code) {
        List list;
        codes++;
        if (suggestionCache.containsKey(code)) {
            hits++;
            list = getCachedList(code);
            return list;
        }
        list = super.getWords(code);
        addToCache(code, list);
        return list;
    }

    /**
    private List getCachedList(String code) {
        CacheObject obj = (CacheObject) suggestionCache.get(code);
        obj.setRefTime();
        return obj.getSuggestionList();
    }

    /**
    private void addToCache(String code, List l) {
        String c = null;
        String lowestCode = null;
        long lowestTime = Long.MAX_VALUE;
        Iterator it;
        CacheObject obj;
        if (suggestionCache.size() >= MAX_CACHED) {
            it = suggestionCache.keySet().iterator();
            while (it.hasNext()) {
                c = (String) it.next();
                obj = (CacheObject) suggestionCache.get(c);
                if (obj.getRefTime() == 0) {
                    lowestCode = c;
                    break;
                }
                if (lowestTime > obj.getRefTime()) {
                    lowestCode = c;
                    lowestTime = obj.getRefTime();
                }
            }
            suggestionCache.remove(lowestCode);
        }
        suggestionCache.put(code, new CacheObject(l));
    }

    /**
    private void loadPreCache(File dicoFile) throws IOException {
        String code;
        List suggestions;
        long size, time;
        File preFile;
        ObjectInputStream in;
        preCacheDir = System.getProperty("user.home") + "/" + JAZZY_DIR;
        preCacheFileName = preCacheDir + "/" + dicoFile.getName() + PRE_CACHE_FILE_EXT;
        preFile = new File(preCacheFileName);
        if (!preFile.exists()) {
            System.err.println("No precache file");
            return;
        }
        in = new ObjectInputStream(new FileInputStream(preFile));
        try {
            size = in.readLong();
            for (int i = 0; i < size; i++) {
                code = (String) in.readObject();
                time = in.readLong();
                suggestions = (List) in.readObject();
                suggestionCache.put(code, new CacheObject(suggestions, time));
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        in.close();
    }

    /**
    public void saveCache() throws IOException {
        String code;
        CacheObject obj;
        File preFile, preDir;
        ObjectOutputStream out;
        Iterator it;
        if (preCacheFileName == null || preCacheDir == null) {
            System.err.println("Precache filename has not been set.");
            return;
        }
        preDir = new File(preCacheDir);
        if (!preDir.exists()) preDir.mkdir();
        preFile = new File(preCacheFileName);
        out = new ObjectOutputStream(new FileOutputStream(preFile));
        it = suggestionCache.keySet().iterator();
        out.writeLong(suggestionCache.size());
        while (it.hasNext()) {
            code = (String) it.next();
            obj = (CacheObject) suggestionCache.get(code);
            out.writeObject(code);
            out.writeLong(obj.getRefTime());
            out.writeObject(obj.getSuggestionList());
        }
        out.close();
    }

    private class CacheObject implements Serializable {

        private List suggestions = null;

        private long refTime = 0;

        public CacheObject(List list) {
            this.suggestions = list;
        }

        public CacheObject(List list, long time) {
            this.suggestions = list;
            this.refTime = time;
        }

        public List getSuggestionList() {
            return suggestions;
        }

        public void setRefTime() {
            refTime = System.currentTimeMillis();
        }

        public long getRefTime() {
            return refTime;
        }
    }
}