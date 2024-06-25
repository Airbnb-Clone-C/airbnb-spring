package com.Cccccc.airbnb.domain.room.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RoomRating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private Room room;

    private float rating;

    private Integer review_count;
    private float cleanliness;
    private float accuracy;
    private float checkin;
    private float communication;
    private float location;
    private float value;
}
