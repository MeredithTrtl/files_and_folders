package com.codeclan.example.files.repositories;

import com.codeclan.example.files.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository <Folder, Long>{
}
