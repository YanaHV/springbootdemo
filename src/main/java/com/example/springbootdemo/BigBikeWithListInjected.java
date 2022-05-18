package com.example.springbootdemo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class BigBikeWithListInjected {
    private final List<CreateBigBike> bigBikeList;

    public void elements(){
        bigBikeList.forEach(CreateBigBike::createBigBike);
    }
}
