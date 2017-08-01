package com.example.demo;


import com.example.demo.candidate.Candidate;
import com.example.demo.rest.RequestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by barbakini on 3.03.2017.
 */
@RestController
@RequestMapping(value = "/api/demo")
public class CandidateController {

    @Autowired
    private CandidateRepository candidateService;


    @RequestMapping(method = RequestMethod.POST)
    public Candidate addCandidate(@RequestParam(value="candidateId", required=true) String candidateId) throws Exception {
        Candidate candidate = candidateService.findOne(candidateId);
        return candidate;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Candidate adddCandidate(@RequestBody RequestModel<Candidate> requestModel) throws Exception {
        Candidate candidate = candidateService.save(requestModel.getData());
        return candidate;
    }

}
