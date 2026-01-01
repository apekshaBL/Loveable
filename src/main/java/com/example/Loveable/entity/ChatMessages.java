package com.example.Loveable.entity;

import com.example.Loveable.enums.MessageRole;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Entity
@Getter
@Setter
@FieldDefaults(level= AccessLevel.PRIVATE)
public class ChatMessages {
    Long id;

    @ManyToOne
    ChatSession chatSession;

    MessageRole role;
    String content;

    String toolCalls;

    Integer tokensUsed;

    Instant createdAt;


}
