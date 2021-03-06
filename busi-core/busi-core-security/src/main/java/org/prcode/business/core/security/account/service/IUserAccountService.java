package org.prcode.business.core.security.account.service;

import org.prcode.business.core.security.account.entity.UserAccount;
import org.prcode.utility.exception.BusinessException;

import java.util.List;

/**
 * @ClassName: IUserAccountService
 * @Date: 2017-4-19 22:08
 * @Auther: kangduo
 * @Description: ()
 */
public interface IUserAccountService {
    List<UserAccount> getUserAccountList(UserAccount account, Byte accountType);

    UserAccount getUserAccount(String userId, Byte accountType);

    Integer addAccount(UserAccount userAccount, byte accountType) throws BusinessException;

    Integer updAccount(UserAccount account);
}
