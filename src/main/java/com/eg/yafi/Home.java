package com.eg.yafi;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.util.List;


@ManagedBean
@RequestScoped
public class Home {
    private List<Entry> entryList;;

    @ManagedProperty("#{entryService}")
    private EntryService entryService;

    public void search() {
        entryList = entryService.getEntryList();
    }

    public List<Entry> getEntryList() {
        return entryList;
    }

    public void setEntryList(List<Entry> entryList) {
        this.entryList = entryList;
    }

    public EntryService getEntryService() {
        return entryService;
    }

    public void setEntryService(EntryService entryService) {
        this.entryService = entryService;
    }
}