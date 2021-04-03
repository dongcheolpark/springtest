package org.pdc.testspring.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.pdc.domain.Member;
import org.pdc.repository.MemoryMemberRepository;

import static org.assertj.core.api.Assertions.*;


class MemoryMemberRepositoryTest {
    MemoryMemberRepository repository = new MemoryMemberRepository();

    @Test
    public void save() {
        Member member = new Member();
        member.setName("spring");

        repository.Save(member);

        Member result = repository.findById(member.getId()).get();
        assertThat(member).isEqualTo(result);
    }
}
