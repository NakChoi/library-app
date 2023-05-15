package com.group.libraryapp.service.user.loanhistory;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.OptionalInt;

public interface UserLoanHistoryRepository extends JpaRepository<UserLoanHistory, Long> {

    // select * from user_loan_history where book_name =? and is_return = ?
    boolean existsByBookNameAndIsReturn(String name, boolean isReturn);

    //Optional<UserLoanHistory> findByUserIdAndBookName(long userId, String bookName);
}


