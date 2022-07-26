package com.nitendratech.pojo;

/**
 * Class Defintion for DVD
 */
public class DVD {
    
    public String name;
    public int releaseYear;
    public String director;

    public DVD(String name, int releaseYear, String director){
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;

    }


    public String toString(){
        return this.name + ", directed by " +this.director + ", release in Year: "+this.releaseYear;
    }

}
