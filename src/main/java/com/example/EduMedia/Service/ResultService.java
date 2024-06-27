package com.example.EduMedia.Service;

import com.example.EduMedia.Model.Result;
import com.example.EduMedia.Repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ResultService {
    @Autowired
    private ResultRepository resultRepository;

    public Result submitResult(Result result) {
        result.setDate(LocalDate.now());
        return resultRepository.save(result);
    }

    public List<Result> getDailyResults() {
        return resultRepository.findByDate(LocalDate.now());
    }
}


