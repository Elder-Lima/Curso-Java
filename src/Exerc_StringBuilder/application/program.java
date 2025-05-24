package Exerc_StringBuilder.application;

import Exerc_StringBuilder.entities.Comment;
import Exerc_StringBuilder.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow thats's awesome!");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);

        Comment c3 = new Comment("Muito Legal!");
        Comment c4 = new Comment("Muito bom!");
        Post p2 = new Post(sdf.parse("22/04/2020 13:05:44"), "Férias em Recife", "Estou conhecendo as Praias de Recife!", 122512);

        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p2);
    }
}
