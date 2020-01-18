package com.crud.library.domain;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class RentsDto {

    private Long id;
    private Long copyId;
    private Long readerId;
    private LocalDateTime rentDate;
    private LocalDateTime returnDate;
}