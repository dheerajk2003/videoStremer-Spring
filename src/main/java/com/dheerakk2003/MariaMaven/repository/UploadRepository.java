package com.dheerakk2003.MariaMaven.repository;

import com.dheerakk2003.MariaMaven.models.Upload;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UploadRepository extends JpaRepository<Upload, Long> {
    Iterable<Upload> findByUserId(Long userId);
    Upload findByFilename(String filename);

    @Query("SELECT u FROM Upload u WHERE u.title LIKE %:title%")
    Iterable<Upload> findByTitle(@Param("title") String title);
}
