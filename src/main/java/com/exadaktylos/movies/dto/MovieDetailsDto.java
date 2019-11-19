package com.exadaktylos.movies.dto;

import lombok.*;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MovieDetailsDto {

    private String title;

    private String description;

    private String director;
}
