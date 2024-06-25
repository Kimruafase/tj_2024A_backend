package day14.Step6;

import java.util.ArrayList;

public class Shelf {
    //  1. 멤버변수
    protected ArrayList<String> shelf;
        //  protected vs public vs private vs 생략(default)
        //  ArrayList<타입> 리스트 변수명 vs 타입[] 배열변수명

    //  2. 생성자
    public Shelf(){
        //  생성자 메소드에 추가적인 로직 가능
        this.shelf = new ArrayList<>();
    }

    //  3. 메소드
    public ArrayList<String> getShelf(){
        return this.shelf;
    }

    public int getCount(){
        return this.shelf.size();
    }
}
