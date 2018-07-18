package com.jdktomcat;

import com.jdktomcat.web.HelloController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import javax.servlet.http.Cookie;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HelloApplication.class)
@WebAppConfiguration
public class HelloApplicationTests {

    private MockMvc mvc;

    private Cookie[] cookies;


    @Before
    public void setUp() {
        mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
        cookies = new Cookie[17];
        cookies[0] = new Cookie("vvc_an", "8.1.0");
        cookies[1] = new Cookie("vvc_q", "41e10c07-e8db-433c-8e4d-fabede31e631");
        cookies[2] = new Cookie("vvc_imei", "502259967100012");
        cookies[3] = new Cookie("vvc_p", "1498243359@qq.com");
        cookies[4] = new Cookie("vvc_model", "vivo+X21UD+A");
        cookies[5] = new Cookie("vvc_s", "2%7C1076971572");
        cookies[6] = new Cookie("vvc_r", "sys_NmFiMTQ0M2IxYjVkOGJjMTRhM2YuMjE1NTYzMzgyLjE1MzE3OTI3MDgwNzY");
        cookies[7] = new Cookie("vvc_cs", "0");
        cookies[8] = new Cookie("vvc_has", "1");
        cookies[9] = new Cookie("vvc_app_version", "1224");
        cookies[10] = new Cookie("vvc_u", "150100335636434d420295c1a87a3500");
        cookies[11] = new Cookie("vvc_openid", "48d349dac0b66908");
        cookies[12] = new Cookie("vvc_pn", "com.bbk.appstore");
        cookies[13] = new Cookie("vvc_elapsedtime", "1009980787");
        cookies[14] = new Cookie("vvc_av", "27");
        cookies[15] = new Cookie("vvc_status", "1");
        cookies[16] = new Cookie("vvc_k", "18cd079fcb74a24b266cd54d62228a8c");
    }

    @Test
    public void hello() throws Exception {
        MultiValueMap<String, String> params = new LinkedMultiValueMap();
        params.set("id", "45");
        mvc.perform(MockMvcRequestBuilders.get("/hello").cookie(cookies)
                .params(params)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Hello World 45")));
    }

}
