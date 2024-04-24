package com.ssafy.devway.domain.challenge.document;

import com.ssafy.devway.domain.challengeDetail.document.ChallengeDetail;
import com.ssafy.devway.domain.member.document.Member;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Transient;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Challenge {

    @Transient
    public static final String SEQUENCE_NAME = "challenge_sequence";

    @Id
    private Long challengeId;

    private String challengeTitle;

    private LocalDate challengeStart;

    private LocalDate challengeEnd;

    private List<Integer> challengeCycle;

    private Boolean challengeAlarm;

    private LocalDateTime challengeAlarmTime;

    private String challengeMemo;

    private Integer challengeStatus;

    private String challengeAppName;

    private LocalDateTime challengeAppTime;

    private String challengeCallName;

    private String challengeCallNumber;

    private LocalDateTime challengeWakeupTime;

    private Integer challengeWalk;

    @DBRef
    private Member member;

    @DBRef
    private ChallengeDetail challengeDetail;

}
