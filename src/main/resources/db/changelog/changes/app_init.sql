create TABLE liquibase_demo.candidate(
    candidate_id character varying(255) NOT NULL,
    candidate_first_name character varying(255) NOT NULL,
    candidate_middle_name character varying(255) NOT NULL,
    candidate_last_name character varying(255) NOT NULL
);

alter table ONLY liquibase_demo.candidate
    ADD CONSTRAINT candidate_param_pkey PRIMARY KEY (candidate_id);

