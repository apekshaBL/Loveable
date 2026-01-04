package com.example.Loveable.dto.member;

import com.example.Loveable.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
