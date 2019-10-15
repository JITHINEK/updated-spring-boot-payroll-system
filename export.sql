--------------------------------------------------------
--  File created - Tuesday-October-15-2019   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table ADDRESS
--------------------------------------------------------

  CREATE TABLE "BOOT"."ADDRESS" 
   (	"ADDRESS_ID" NUMBER(10,0), 
	"COUNTRY" VARCHAR2(255 CHAR), 
	"CITY" VARCHAR2(255 CHAR), 
	"DOOR_NO" NUMBER(10,0), 
	"STATE" VARCHAR2(255 CHAR), 
	"STREET_NAME" VARCHAR2(255 CHAR), 
	"ZIP_CODE" NUMBER(10,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table BANK
--------------------------------------------------------

  CREATE TABLE "BOOT"."BANK" 
   (	"BANK_ID" NUMBER(10,0), 
	"ACC_NO" NUMBER(19,0), 
	"BANK_NAME" VARCHAR2(255 CHAR), 
	"IFSC_CODE" VARCHAR2(255 CHAR)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table DEPARTMENT
--------------------------------------------------------

  CREATE TABLE "BOOT"."DEPARTMENT" 
   (	"DEPARTMENT_ID" NUMBER(10,0), 
	"DEPARTMENT_NAME" VARCHAR2(255 CHAR)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table EMPLOYEE
--------------------------------------------------------

  CREATE TABLE "BOOT"."EMPLOYEE" 
   (	"EMPLOYE_ID" NUMBER(10,0), 
	"AADHAR" NUMBER(19,0), 
	"DATE_OF_BIRTH" DATE, 
	"DATE_OF_JOIN" DATE, 
	"DESIGNATION" VARCHAR2(255 CHAR), 
	"EMAIL" VARCHAR2(255 CHAR), 
	"EMPLOYE_NAME" VARCHAR2(255 CHAR), 
	"GENDER" VARCHAR2(255 CHAR), 
	"MOBILE_NO" NUMBER(19,0), 
	"PAN_CARD_NO" VARCHAR2(255 CHAR), 
	"BANK_ID" NUMBER(10,0), 
	"DEPARTMENT_ID" NUMBER(10,0), 
	"ADDRESS_ID" NUMBER(10,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table LOGIN
--------------------------------------------------------

  CREATE TABLE "BOOT"."LOGIN" 
   (	"ID" NUMBER(10,0), 
	"PASSWORD" VARCHAR2(255 CHAR), 
	"EMPLOYE_ID" NUMBER(10,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table MBO_PAYOUT
--------------------------------------------------------

  CREATE TABLE "BOOT"."MBO_PAYOUT" 
   (	"MBO_PAYOUT_ID" NUMBER(10,0), 
	"AMOUNT" FLOAT(126), 
	"DATEORECEIVE" DATE, 
	"PERFOMANCE_ID" NUMBER(10,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table PAYSLIP
--------------------------------------------------------

  CREATE TABLE "BOOT"."PAYSLIP" 
   (	"PAYSLIP_ID" NUMBER(10,0), 
	"DATE_OF_GENERATION" DATE, 
	"SALARY_ID" NUMBER(10,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table PERFOMANCE
--------------------------------------------------------

  CREATE TABLE "BOOT"."PERFOMANCE" 
   (	"PERFOMANCE_ID" NUMBER(10,0), 
	"QUATER" NUMBER(10,0), 
	"RATING" NUMBER(10,0), 
	"YEAR" NUMBER(10,0), 
	"EMPLOYE_ID" NUMBER(10,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table SALARY
--------------------------------------------------------

  CREATE TABLE "BOOT"."SALARY" 
   (	"SALARY_ID" NUMBER(10,0), 
	"BASIC_SALARY" NUMBER(10,0), 
	"BONUS" NUMBER(10,0), 
	"DATE_OF_RECEIVE" DATE, 
	"FOOD_REIMBURSE" NUMBER(10,0), 
	"HRA" NUMBER(10,0), 
	"PROFESSIONAL_TAX" NUMBER(10,0), 
	"PROVIDENT_FUND" NUMBER(10,0), 
	"SPECIAL_ALLOWANCE" NUMBER(10,0), 
	"EMPLOYE_ID" NUMBER(10,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into BOOT.ADDRESS
SET DEFINE OFF;
Insert into BOOT.ADDRESS (ADDRESS_ID,COUNTRY,CITY,DOOR_NO,STATE,STREET_NAME,ZIP_CODE) values (101,'India','Navalur',502,'Tamil Nadu','St Thomes',856525);
REM INSERTING into BOOT.BANK
SET DEFINE OFF;
Insert into BOOT.BANK (BANK_ID,ACC_NO,BANK_NAME,IFSC_CODE) values (101,2521425,'HDFC','hdfc8002');
REM INSERTING into BOOT.DEPARTMENT
SET DEFINE OFF;
Insert into BOOT.DEPARTMENT (DEPARTMENT_ID,DEPARTMENT_NAME) values (101,'Development');
Insert into BOOT.DEPARTMENT (DEPARTMENT_ID,DEPARTMENT_NAME) values (102,'Testing');
Insert into BOOT.DEPARTMENT (DEPARTMENT_ID,DEPARTMENT_NAME) values (103,'Support');
Insert into BOOT.DEPARTMENT (DEPARTMENT_ID,DEPARTMENT_NAME) values (104,'Security');
REM INSERTING into BOOT.EMPLOYEE
SET DEFINE OFF;
Insert into BOOT.EMPLOYEE (EMPLOYE_ID,AADHAR,DATE_OF_BIRTH,DATE_OF_JOIN,DESIGNATION,EMAIL,EMPLOYE_NAME,GENDER,MOBILE_NO,PAN_CARD_NO,BANK_ID,DEPARTMENT_ID,ADDRESS_ID) values (8064123,855262523214,to_date('09-10-19','DD-MM-RR'),to_date('26-06-19','DD-MM-RR'),'Associate Engineer','jithin@virtusa.com','Jithin E K','Male',8565425232,'2347SDFG',101,101,101);
REM INSERTING into BOOT.LOGIN
SET DEFINE OFF;
Insert into BOOT.LOGIN (ID,PASSWORD,EMPLOYE_ID) values (101,'$2a$10$zugaddjOJtDLe09PhUnVJ.g4YOhkryAc78/D/7nppn6wxGfzsP3YK',8064123);
REM INSERTING into BOOT.MBO_PAYOUT
SET DEFINE OFF;
Insert into BOOT.MBO_PAYOUT (MBO_PAYOUT_ID,AMOUNT,DATEORECEIVE,PERFOMANCE_ID) values (101,4200,to_date('30-09-19','DD-MM-RR'),101);
REM INSERTING into BOOT.PAYSLIP
SET DEFINE OFF;
Insert into BOOT.PAYSLIP (PAYSLIP_ID,DATE_OF_GENERATION,SALARY_ID) values (101,to_date('31-07-19','DD-MM-RR'),101);
Insert into BOOT.PAYSLIP (PAYSLIP_ID,DATE_OF_GENERATION,SALARY_ID) values (102,to_date('31-08-19','DD-MM-RR'),102);
Insert into BOOT.PAYSLIP (PAYSLIP_ID,DATE_OF_GENERATION,SALARY_ID) values (103,to_date('30-09-19','DD-MM-RR'),103);
REM INSERTING into BOOT.PERFOMANCE
SET DEFINE OFF;
Insert into BOOT.PERFOMANCE (PERFOMANCE_ID,QUATER,RATING,YEAR,EMPLOYE_ID) values (101,3,4,2019,8064123);
REM INSERTING into BOOT.SALARY
SET DEFINE OFF;
Insert into BOOT.SALARY (SALARY_ID,BASIC_SALARY,BONUS,DATE_OF_RECEIVE,FOOD_REIMBURSE,HRA,PROFESSIONAL_TAX,PROVIDENT_FUND,SPECIAL_ALLOWANCE,EMPLOYE_ID) values (101,15000,5000,to_date('31-07-19','DD-MM-RR'),0,0,800,1200,2500,8064123);
Insert into BOOT.SALARY (SALARY_ID,BASIC_SALARY,BONUS,DATE_OF_RECEIVE,FOOD_REIMBURSE,HRA,PROFESSIONAL_TAX,PROVIDENT_FUND,SPECIAL_ALLOWANCE,EMPLOYE_ID) values (102,15000,1000,to_date('31-08-19','DD-MM-RR'),0,0,800,1200,2000,8064123);
Insert into BOOT.SALARY (SALARY_ID,BASIC_SALARY,BONUS,DATE_OF_RECEIVE,FOOD_REIMBURSE,HRA,PROFESSIONAL_TAX,PROVIDENT_FUND,SPECIAL_ALLOWANCE,EMPLOYE_ID) values (103,15000,2000,to_date('30-09-19','DD-MM-RR'),0,0,800,1200,2000,8064123);
--------------------------------------------------------
--  DDL for Index SYS_C007473
--------------------------------------------------------

  CREATE UNIQUE INDEX "BOOT"."SYS_C007473" ON "BOOT"."ADDRESS" ("ADDRESS_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index SYS_C007475
--------------------------------------------------------

  CREATE UNIQUE INDEX "BOOT"."SYS_C007475" ON "BOOT"."BANK" ("BANK_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index SYS_C007477
--------------------------------------------------------

  CREATE UNIQUE INDEX "BOOT"."SYS_C007477" ON "BOOT"."DEPARTMENT" ("DEPARTMENT_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index SYS_C007479
--------------------------------------------------------

  CREATE UNIQUE INDEX "BOOT"."SYS_C007479" ON "BOOT"."EMPLOYEE" ("EMPLOYE_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index SYS_C007481
--------------------------------------------------------

  CREATE UNIQUE INDEX "BOOT"."SYS_C007481" ON "BOOT"."LOGIN" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index SYS_C007483
--------------------------------------------------------

  CREATE UNIQUE INDEX "BOOT"."SYS_C007483" ON "BOOT"."MBO_PAYOUT" ("MBO_PAYOUT_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index SYS_C007528
--------------------------------------------------------

  CREATE UNIQUE INDEX "BOOT"."SYS_C007528" ON "BOOT"."PAYSLIP" ("PAYSLIP_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index SYS_C007487
--------------------------------------------------------

  CREATE UNIQUE INDEX "BOOT"."SYS_C007487" ON "BOOT"."PERFOMANCE" ("PERFOMANCE_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index SYS_C007513
--------------------------------------------------------

  CREATE UNIQUE INDEX "BOOT"."SYS_C007513" ON "BOOT"."SALARY" ("SALARY_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table ADDRESS
--------------------------------------------------------

  ALTER TABLE "BOOT"."ADDRESS" ADD PRIMARY KEY ("ADDRESS_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "BOOT"."ADDRESS" MODIFY ("ADDRESS_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table BANK
--------------------------------------------------------

  ALTER TABLE "BOOT"."BANK" ADD PRIMARY KEY ("BANK_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "BOOT"."BANK" MODIFY ("BANK_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table DEPARTMENT
--------------------------------------------------------

  ALTER TABLE "BOOT"."DEPARTMENT" ADD PRIMARY KEY ("DEPARTMENT_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "BOOT"."DEPARTMENT" MODIFY ("DEPARTMENT_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table EMPLOYEE
--------------------------------------------------------

  ALTER TABLE "BOOT"."EMPLOYEE" ADD PRIMARY KEY ("EMPLOYE_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "BOOT"."EMPLOYEE" MODIFY ("EMPLOYE_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table LOGIN
--------------------------------------------------------

  ALTER TABLE "BOOT"."LOGIN" ADD PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "BOOT"."LOGIN" MODIFY ("ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table MBO_PAYOUT
--------------------------------------------------------

  ALTER TABLE "BOOT"."MBO_PAYOUT" ADD PRIMARY KEY ("MBO_PAYOUT_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "BOOT"."MBO_PAYOUT" MODIFY ("MBO_PAYOUT_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table PAYSLIP
--------------------------------------------------------

  ALTER TABLE "BOOT"."PAYSLIP" ADD PRIMARY KEY ("PAYSLIP_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "BOOT"."PAYSLIP" MODIFY ("PAYSLIP_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table PERFOMANCE
--------------------------------------------------------

  ALTER TABLE "BOOT"."PERFOMANCE" ADD PRIMARY KEY ("PERFOMANCE_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "BOOT"."PERFOMANCE" MODIFY ("PERFOMANCE_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table SALARY
--------------------------------------------------------

  ALTER TABLE "BOOT"."SALARY" ADD PRIMARY KEY ("SALARY_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "BOOT"."SALARY" MODIFY ("SALARY_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table EMPLOYEE
--------------------------------------------------------

  ALTER TABLE "BOOT"."EMPLOYEE" ADD CONSTRAINT "FKBEJTWVG9BXUS2MFFSM3SWJ3U9" FOREIGN KEY ("DEPARTMENT_ID")
	  REFERENCES "BOOT"."DEPARTMENT" ("DEPARTMENT_ID") ENABLE;
  ALTER TABLE "BOOT"."EMPLOYEE" ADD CONSTRAINT "FKGA73HDTPB67TWLR9C1I337TYT" FOREIGN KEY ("ADDRESS_ID")
	  REFERENCES "BOOT"."ADDRESS" ("ADDRESS_ID") ENABLE;
  ALTER TABLE "BOOT"."EMPLOYEE" ADD CONSTRAINT "FKICPTSO0QH4VMWT76BGF5HM9P6" FOREIGN KEY ("BANK_ID")
	  REFERENCES "BOOT"."BANK" ("BANK_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table LOGIN
--------------------------------------------------------

  ALTER TABLE "BOOT"."LOGIN" ADD CONSTRAINT "FKJTWSWSR8MKDK0IOA3L4W0VB1C" FOREIGN KEY ("EMPLOYE_ID")
	  REFERENCES "BOOT"."EMPLOYEE" ("EMPLOYE_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table MBO_PAYOUT
--------------------------------------------------------

  ALTER TABLE "BOOT"."MBO_PAYOUT" ADD CONSTRAINT "FKBOR0FK13BHFX3B61JRHTF3VY4" FOREIGN KEY ("PERFOMANCE_ID")
	  REFERENCES "BOOT"."PERFOMANCE" ("PERFOMANCE_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table PAYSLIP
--------------------------------------------------------

  ALTER TABLE "BOOT"."PAYSLIP" ADD CONSTRAINT "FKLP01YEXO9HGX6N1PC2UGFEB8L" FOREIGN KEY ("SALARY_ID")
	  REFERENCES "BOOT"."SALARY" ("SALARY_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table PERFOMANCE
--------------------------------------------------------

  ALTER TABLE "BOOT"."PERFOMANCE" ADD CONSTRAINT "FK6Y5MJBVM25MY22D18T4W9VYQA" FOREIGN KEY ("EMPLOYE_ID")
	  REFERENCES "BOOT"."EMPLOYEE" ("EMPLOYE_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table SALARY
--------------------------------------------------------

  ALTER TABLE "BOOT"."SALARY" ADD CONSTRAINT "FKGSQ77D6S3043YUUAPI7KTPU79" FOREIGN KEY ("EMPLOYE_ID")
	  REFERENCES "BOOT"."EMPLOYEE" ("EMPLOYE_ID") ENABLE;
