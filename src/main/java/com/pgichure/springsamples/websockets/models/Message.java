package com.pgichure.springsamples.websockets.models;

import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class Message {

	private String name;

}