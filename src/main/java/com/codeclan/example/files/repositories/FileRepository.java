package com.codeclan.example.files.repositories;

import com.codeclan.example.files.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository <File, Long> {
}
