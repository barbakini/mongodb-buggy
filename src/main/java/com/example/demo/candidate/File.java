package com.example.demo.candidate;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * Created by barbakini on 7.03.2017.
 */
@Data
public class File extends CandidateInfo {

    private String ownerId;

    private String fileName;

    private String docType;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    private Date createDate;

    private String fileDescription;

    private DetailedData contentType;

    private boolean bound;

}
