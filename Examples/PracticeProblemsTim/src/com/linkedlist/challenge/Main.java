package com.linkedlist.challenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main
{
    private static ArrayList<Album> albums = new ArrayList<>();
    public static void main(String[] args) {
        Album album = new Album("new love","selena");
        album.AddSong("same old love",4.20);
        album.AddSong("who says",3.20);
        album.AddSong("we dont talk anymore",3.00);
        album.AddSong("baila",2.20);
        albums.add(album);
        LinkedList<Song> playlist = new LinkedList<>();
        albums.get(0).addToPlaylist(1,playlist);
        albums.get(0).addToPlaylist(2,playlist);
        albums.get(0).addToPlaylist(3,playlist);
        albums.get(0).addToPlaylist(4,playlist);
        play(playlist);
        System.out.println(playlist);

    }


    private static void play(LinkedList<Song> playlist)
    {
        Scanner scanner = new Scanner(System.in);
        boolean quit= true;
        boolean forward =  true;

        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0)
        {
            System.out.println("no songs in playlist");
            return;
        }
        else
        {
            System.out.println("Now playing "+listIterator.next().toString());
        }
        while(!quit)
        {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action)
            {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext())
                        System.out.println("now playing "+listIterator.next().toString());
                    else{
                        System.out.println("End of list");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward) {
                        if (listIterator.hasPrevious())
                            listIterator.previous();
                        forward = false;
                    }
                    if(listIterator.hasPrevious())
                    {
                        System.out.println("now playing"+listIterator.previous().toString());

                    }
                    else
                    {
                        System.out.println("in the beginning");
                        forward=true;
                    }
                    break;
                case 3: if(forward){
                    if(listIterator.hasPrevious()){
                        System.out.println("playing "+ listIterator.previous().toString());
                        forward = false;
                    }
                    else{
                        System.out.println("start of the list");
                    }}
                    else {
                    if(listIterator.hasNext())
                    {
                        System.out.println("playing" + listIterator.next().toString());
                        forward = true;
                    }
                    else
                    {
                        System.out.println("end of list");
                    }
                }
                case 4:
                    System.out.println(playlist);
                    break;
                case 5:
                    System.out.println("menu");
                    break;
            }
        }
    }
}
