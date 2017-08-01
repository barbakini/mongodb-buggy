package com.example.demo.candidate;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created by barbakini on 3.03.2017.
 */

@Document
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Candidate {

    private String _id;

    @Valid
    @NotNull
    private GeneralInfo generalInfo;

    @Valid
    private CandidateInfoContainer<Email> emails;

    @Valid
    private CandidateInfoContainer<Phone> phones;

    @Valid
    private CandidateInfoContainer<Address> addresses;

    @Valid
    private CandidateInfoContainer<SocialMediaAccount> socialAccounts;

    @Valid
    private CandidateInfoContainer<CandNationality> nationalities;

    @Valid
    private CandidateInfoContainer<CandSkill> skills;

    @Valid
    private CandidateInfoContainer<CandLanguage> languages;

    @Valid
    private CandidateInfoContainer<Education> educations;

    @Valid
    private CandidateInfoContainer<Certificate> certificates;

    @Valid
    private CandidateInfoContainer<Travel> travels;

    @Valid
    private CandidateInfoContainer<DriverLicense> driverLicenses;

    @Valid
    private MilitaryInfo militaryInfo;

    @Valid
    private Handicap handicap;

    @Valid
    private Preference preference;

    @Valid
    private CandidateInfoContainer<FreeTextModel> prefaces;

    @Valid
    private CandidateInfoContainer<Reference> references;

    @Valid
    private CandidateInfoContainer<Project> projects;

    @Valid
    private CandidateInfoContainer<File> files;

    @Valid
    private CandidateInfoContainer<Experience> experiences;

    private CvPoolInfo cvPoolInfo;

    @Valid
    private OtherInfo otherInfo;

    @Valid
    private CandidateInfoContainer<FreeTextModel> volunteerings;
}
