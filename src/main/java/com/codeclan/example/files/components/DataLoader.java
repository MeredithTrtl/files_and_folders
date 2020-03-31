package com.codeclan.example.files.components;

import com.codeclan.example.files.models.File;
import com.codeclan.example.files.models.Folder;
import com.codeclan.example.files.models.User;
import com.codeclan.example.files.repositories.FileRepository;
import com.codeclan.example.files.repositories.FolderRepository;
import com.codeclan.example.files.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;


    @Autowired
    FileRepository fileRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        User user1 = new User("Meredith");
        userRepository.save(user1);
        User user2 = new User("Barry");
        userRepository.save(user2);
        User user3 = new User("Larry");
        userRepository.save(user3);
        Folder folder1 = new Folder("Java Project", user1);
        folderRepository.save(folder1);
        Folder folder2 = new Folder("ART", user1);
        folderRepository.save(folder2);
        File file1 = new File("house", ".jpg", 200, folder1);
        fileRepository.save(file1);
        File file2 = new File("dog", ".jpg", 200, folder2);
        fileRepository.save(file2);
        File file3 = new File("badger", ".xml", 1, folder2);
        fileRepository.save(file3);
        user3.addFolder(folder2);
        userRepository.save(user1);
    }

}
