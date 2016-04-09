package com.leo.entity;

/** 
 * <p>User: leo
 * <p>Date: 13-12-22 
 * <p>Version: 1.0 
 */  
public class User {  
    private Long id;  
    private String name;  
  
    public Long getId() {  
        return id;  
    }  
  
    public void setId(Long id) {  
        this.id = id;  
    }  
  
    public String getName() {  
        return name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
  
    @Override  
    public boolean equals(Object o) {  
        if (this == o) return true;  
        if (o == null || getClass() != o.getClass()) return false;  
  
        User user = (User) o;  
  
        if (id != null ? !id.equals(user.id) : user.id != null) return false;  
  
        return true;  
    }  
  
    @Override  
    public int hashCode() {  
        return id != null ? id.hashCode() : 0;  
    }  
}  