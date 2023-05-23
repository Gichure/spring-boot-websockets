package com.pgichure.springsamples.websockets.models;

import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class Greeting{

    private String content;

}