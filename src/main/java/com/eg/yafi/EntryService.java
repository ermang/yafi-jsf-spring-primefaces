package com.eg.yafi;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EntryService {

    public List getEntryList() {
        List<Entry> entryList = new ArrayList<>();
        Entry e1 = new Entry();
        e1.setId(1L);
        e1.setContent("content1");
        Entry e2 = new Entry();
        e2.setId(2L);
        e2.setContent("content2");

        entryList.add(e1);
        entryList.add(e2);

        return entryList;
    }
}
