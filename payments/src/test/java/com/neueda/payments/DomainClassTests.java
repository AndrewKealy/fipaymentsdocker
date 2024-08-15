package com.neueda.payments;

import com.neueda.payments.model.Payment;
import com.neueda.payments.repositories.PaymentsRepository;
import com.neueda.payments.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class DomainClassTests {


    @MockBean
    private PaymentsRepository paymentsRepository;

    @MockBean
    private UserRepository userRepository;

    
    @Test
    public void testEqualityOfPaymentsUsingIDOnly() {
        Payment p1 = new Payment();
        p1.setId(17L);
        Payment p2 = new Payment();
        p2.setId(17L);
        assertEquals(p1,p2);
    }

}
