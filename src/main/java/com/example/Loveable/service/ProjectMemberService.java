package com.example.Loveable.service;

import com.example.Loveable.dto.member.InviteMemberRequest;
import com.example.Loveable.dto.member.MemberResponse;
import com.example.Loveable.dto.member.UpdateMemberRoleRequest;

import java.util.List;

public interface ProjectMemberService {

    List<MemberResponse> getProjectMembers(Long projectId, Long userId);
    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);
    MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId);
    MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId);
}
