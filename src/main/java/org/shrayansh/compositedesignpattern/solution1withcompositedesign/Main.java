package org.shrayansh.compositedesignpattern.solution1withcompositedesign;

public class Main {
    public static void main(String[] args) {
         Directory movieDirectory=new Directory("Movie");

         FileSystem borderMovie=new File("Border");
         movieDirectory.add(borderMovie);

         Directory comedyMovie=new Directory("ComedyMovie");
         FileSystem hulchulMovie=new File("Hulchul");
         comedyMovie.add(hulchulMovie);

         movieDirectory.add(comedyMovie);

         movieDirectory.ls();

    }
}
