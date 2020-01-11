package com.company.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by omerfarukcoban on 30.11.2019.
 */
public class Demo {

    public static void main(String[] args) {

        try {
            Album album = (Album) MediaStore.getMedia(MediaType.ALBUM);
            Movie movie = (Movie) MediaStore.getMedia(MediaType.MOVIE);
            System.out.println(album.toString());
            System.out.println(movie.toString());


        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
