package com.ociv.holidays;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.env.Environment;

import com.ociv.holidays.config.Constants;

@SpringBootApplication
@EnableConfigurationProperties({ LiquibaseProperties.class })
public class HolidayApplication {
	
	private static final Logger log = LoggerFactory.getLogger(HolidayApplication.class);
	
    @Inject
    private Environment env;
    
    /**
     * Initializes holidaysAPI.
     * <p>
     * Spring profiles can be configured with a program arguments --spring.profiles.active=your-active-profile
     * <p>
     * You can find more information on how profiles work with JHipster on <a href="http://jhipster.github.io/profiles/">http://jhipster.github.io/profiles/</a>.
     */
    @PostConstruct
    public void initApplication() {
    	
        log.info("Running with Spring profile(s) : {}", Arrays.toString(env.getActiveProfiles()));
        
        Collection<String> activeProfiles = Arrays.asList(env.getActiveProfiles());
        
        if (activeProfiles.contains(Constants.SPRING_PROFILE_DEVELOPMENT) && activeProfiles.contains(Constants.SPRING_PROFILE_PRODUCTION)) {
            log.error("You have misconfigured your application! It should not run " +
                "with both the 'dev' and 'prod' profiles at the same time.");
        }
    }

	public static void main(String[] args) throws UnknownHostException {
		
		//SpringApplication.run(HolidayApplication.class, args);
		
        SpringApplication app = new SpringApplication(HolidayApplication.class);
        
        Environment env = app.run(args).getEnvironment();
        log.info("\n----------------------------------------------------------\n\t" +
                "Application '{}' is running! Access URLs:\n\t" +
                "Local: \t\thttp://127.0.0.1:{}\n\t" +
                "External: \thttp://{}:{}\n----------------------------------------------------------",
            env.getProperty("spring.application.name"),
            env.getProperty("server.port"),
            InetAddress.getLocalHost().getHostAddress(),
            env.getProperty("server.port"));
	}
}
