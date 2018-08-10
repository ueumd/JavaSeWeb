package com.daysun.javase.collection.list;

class Book{
    int id;
    String name;
    public  Book(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        return this.id==book.id;
    }

}
