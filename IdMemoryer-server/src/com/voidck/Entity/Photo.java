package com.voidck.Entity;

public class Photo
{
    private Integer id;
    private String name;
    private String url;
    private Boolean selectResult;

    public Photo(Integer id, String name, String url) {
        this.id = id;
        this.name = name;
        this.url = url;
    }

    public Photo() {

    }

    public Photo(String name, String url) {
        this.name = name;
        this.url = url;

    }

    public Photo(Integer id) {
        this.id = id;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getSelectResult() {
        return selectResult;
    }

    public void setSelectResult(Boolean selectResult) {
        this.selectResult = selectResult;
    }
}
