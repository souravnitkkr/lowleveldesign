package org.shrayansh.compositedesignpattern.solution1withcompositedesign;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    String directoryName;

    List<FileSystem> fileSystemList;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        fileSystemList=new ArrayList<>();
    }

    void add(FileSystem fileSystem){
        fileSystemList.add(fileSystem);
    }

    @Override
    public void ls() {

        System.out.println("Directory name " + directoryName);

        for (FileSystem fileSystem:fileSystemList){
            fileSystem.ls();
        }
    }
}
