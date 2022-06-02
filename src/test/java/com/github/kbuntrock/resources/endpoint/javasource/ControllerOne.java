package com.github.kbuntrock.resources.endpoint.generic;

import com.github.kbuntrock.resources.Constants;
import com.github.kbuntrock.resources.dto.AccountDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@RequestMapping(Constants.BASE_API + "/generic")
public interface GenericityController {

    @GetMapping("/account-page")
    boolean getAccountsPage(@RequestBody List<Map<Long, List<AccountDto[]>[]>[]> test);
//
//    @GetMapping("/time-page")
//    PageDto<TimeDto> getTimePage();
//
//    @GetMapping("/authority-page")
//    PageDto<Authority> getAuthorityPage();
//
//    @PostMapping("/account-page")
//    String setAccountsPage(@RequestBody PageDto<AccountDto> accounts);
//
//    @GetMapping(path = "/account-map/{perimeterId}", produces = MediaType.APPLICATION_JSON_VALUE)
//    Map<String, AccountDto[]> getAccountMap(@PathVariable Long perimeterId);

    //@GetMapping(path = "/authority-page-map/{perimeterId}", produces = MediaType.APPLICATION_JSON_VALUE)
    Map<String, Map<Long, List<List<AccountDto>[]>>>[] getAuthorityPageMap(@PathVariable Long perimeterId);
    //List<Authority> getAuthorityPageMap(@PathVariable Long perimeterId);
}