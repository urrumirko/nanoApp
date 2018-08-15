INSERT INTO `campaign` (`name`,`goal`,`total_budget`,`status`) VALUES ('Test Ad 1','Increase Reach', 130, 'Delivering');

INSERT INTO `platform` (`type`,`status`,`total_budget`, `remaining_budget`, `start_date`, `end_date`) VALUES ('Facebook','Delivering',40, 13, 1530568800000, 1533901600000);

INSERT INTO CAMPAIGN_PLATFORM (`campaign_id`,`platform_id`) VALUES (1,1);

INSERT INTO `target_audiance` (`id`, `platform_platform_id`) VALUES (1,1);

INSERT INTO `languages` (TARGET_AUDIANCE_ID,`language`) VALUES (1,'FR');
INSERT INTO `languages` (TARGET_AUDIANCE_ID,`language`) VALUES (1,'EN');
INSERT INTO `languages` (TARGET_AUDIANCE_ID,`language`) VALUES (1,'DE');

INSERT INTO `genders` (TARGET_AUDIANCE_ID,`gender`) VALUES (1,'M');
INSERT INTO `genders` (TARGET_AUDIANCE_ID,`gender`) VALUES (1,'F');

INSERT INTO `age_range` (TARGET_AUDIANCE_ID,`age_range`) VALUES (1,30);
INSERT INTO `age_range` (TARGET_AUDIANCE_ID,`age_range`) VALUES (1,60);

INSERT INTO `locations` (TARGET_AUDIANCE_ID,`location`) VALUES (1,'France');
INSERT INTO `locations` (TARGET_AUDIANCE_ID,`location`) VALUES (1,'Germany');
INSERT INTO `locations` (TARGET_AUDIANCE_ID,`location`) VALUES (1,'Switzerland');

INSERT INTO `interests` (TARGET_AUDIANCE_ID,`interest`) VALUES (1,'Docker');
INSERT INTO `interests` (TARGET_AUDIANCE_ID,`interest`) VALUES (1,'Kubernates');
INSERT INTO `interests` (TARGET_AUDIANCE_ID,`interest`) VALUES (1,'DevOps');
INSERT INTO `interests` (TARGET_AUDIANCE_ID,`interest`) VALUES (1,'AWS');
INSERT INTO `interests` (TARGET_AUDIANCE_ID,`interest`) VALUES (1,'Google Cloud Platform');
INSERT INTO `interests` (TARGET_AUDIANCE_ID,`interest`) VALUES (1,'Ubuntu');

INSERT INTO `creative` (`header`,`description`,`url`, `image`, `platform_platform_id`) VALUES ('DevOps Made Easy, We Take care of the heavy lifting for you','DOP SuperHero is where all DevOps is going to happen in the future, join the revolution today!','https://example.io','img1.jpg',1);

INSERT INTO `insight` (`impressions`,`clicks`,`website_visits`, `nanos_score`, `cost_per_click`, `click_through_rate`, `advanced_kpi1`, `advanced_kpi3`, `platform_platform_id`) 
VALUES (436,330,178,5.3,1.38,0.43,39,0.00143,1);



INSERT INTO `platform` (`type`,`status`,`total_budget`, `remaining_budget`, `start_date`, `end_date`) VALUES ('Instagram','Delivering',44, 14, 1530568800000, 1533901600000);

INSERT INTO CAMPAIGN_PLATFORM (`campaign_id`,`platform_id`) VALUES (1,2);

INSERT INTO `target_audiance` (`id`, `platform_platform_id`) VALUES (2,2);

INSERT INTO `languages` (TARGET_AUDIANCE_ID,`language`) VALUES (2,'FR');
INSERT INTO `languages` (TARGET_AUDIANCE_ID,`language`) VALUES (2,'EN');
INSERT INTO `languages` (TARGET_AUDIANCE_ID,`language`) VALUES (2,'DE');

INSERT INTO `genders` (TARGET_AUDIANCE_ID,`gender`) VALUES (2,'M');
INSERT INTO `genders` (TARGET_AUDIANCE_ID,`gender`) VALUES (2,'F');

INSERT INTO `age_range` (TARGET_AUDIANCE_ID,`age_range`) VALUES (2,20);
INSERT INTO `age_range` (TARGET_AUDIANCE_ID,`age_range`) VALUES (2,60);

INSERT INTO `locations` (TARGET_AUDIANCE_ID,`location`) VALUES (2,'France');
INSERT INTO `locations` (TARGET_AUDIANCE_ID,`location`) VALUES (2,'Germany');
INSERT INTO `locations` (TARGET_AUDIANCE_ID,`location`) VALUES (2,'Switzerland');

INSERT INTO `interests` (TARGET_AUDIANCE_ID,`interest`) VALUES (2,'Docker');
INSERT INTO `interests` (TARGET_AUDIANCE_ID,`interest`) VALUES (2,'Kubernates');
INSERT INTO `interests` (TARGET_AUDIANCE_ID,`interest`) VALUES (2,'DevOps');
INSERT INTO `interests` (TARGET_AUDIANCE_ID,`interest`) VALUES (2,'AWS');
INSERT INTO `interests` (TARGET_AUDIANCE_ID,`interest`) VALUES (2,'Google Cloud Platform');
INSERT INTO `interests` (TARGET_AUDIANCE_ID,`interest`) VALUES (2,'Ubuntu');

INSERT INTO `creative` (`header`,`description`,`url`, `image`, `platform_platform_id`) VALUES ('DevOps Made Easy, We Take care of the heavy lifting for you','DOP SuperHero is where all DevOps is going to happen in the future, join the revolution today!','https://example.io','img1.jpg',2);

INSERT INTO `insight` (`impressions`,`clicks`,`website_visits`, `nanos_score`, `cost_per_click`, `click_through_rate`, `advanced_kpi1`, `advanced_kpi3`, `platform_platform_id`) 
VALUES (436,330,178,5.3,1.38,0.43,39,0.00143,2);


INSERT INTO `platform` (`type`,`status`,`total_budget`, `remaining_budget`, `start_date`, `end_date`) VALUES ('Google','Delivering',36, 34, 1530568800000, 1533901600000);

INSERT INTO CAMPAIGN_PLATFORM (`campaign_id`,`platform_id`) VALUES (1,3);

INSERT INTO `target_audiance` (`id`, `platform_platform_id`) VALUES (3,3);

INSERT INTO `languages` (TARGET_AUDIANCE_ID,`language`) VALUES (3,'FR');
INSERT INTO `languages` (TARGET_AUDIANCE_ID,`language`) VALUES (3,'EN');
INSERT INTO `languages` (TARGET_AUDIANCE_ID,`language`) VALUES (3,'DE');

INSERT INTO `genders` (TARGET_AUDIANCE_ID,`gender`) VALUES (3,'M');
INSERT INTO `genders` (TARGET_AUDIANCE_ID,`gender`) VALUES (3,'F');

INSERT INTO `age_range` (TARGET_AUDIANCE_ID,`age_range`) VALUES (3,20);
INSERT INTO `age_range` (TARGET_AUDIANCE_ID,`age_range`) VALUES (3,66);

INSERT INTO `locations` (TARGET_AUDIANCE_ID,`location`) VALUES (3,'France');
INSERT INTO `locations` (TARGET_AUDIANCE_ID,`location`) VALUES (3,'Germany');
INSERT INTO `locations` (TARGET_AUDIANCE_ID,`location`) VALUES (3,'Switzerland');
INSERT INTO `locations` (TARGET_AUDIANCE_ID,`location`) VALUES (3,'Italy');
INSERT INTO `locations` (TARGET_AUDIANCE_ID,`location`) VALUES (3,'Spain');
INSERT INTO `locations` (TARGET_AUDIANCE_ID,`location`) VALUES (3,'Belgium');
INSERT INTO `locations` (TARGET_AUDIANCE_ID,`location`) VALUES (3,'United Kingdom');
INSERT INTO `locations` (TARGET_AUDIANCE_ID,`location`) VALUES (3,'Poland');

INSERT INTO `interests` (TARGET_AUDIANCE_ID,`interest`) VALUES (3,'Easy DevOps');
INSERT INTO `interests` (TARGET_AUDIANCE_ID,`interest`) VALUES (3,'DevOps As A Service');
INSERT INTO `interests` (TARGET_AUDIANCE_ID,`interest`) VALUES (3,'DevOps');
INSERT INTO `interests` (TARGET_AUDIANCE_ID,`interest`) VALUES (3,'AWS');
INSERT INTO `interests` (TARGET_AUDIANCE_ID,`interest`) VALUES (3,'Google Cloud Platform');
INSERT INTO `interests` (TARGET_AUDIANCE_ID,`interest`) VALUES (3,'DevOps Automation');
INSERT INTO `interests` (TARGET_AUDIANCE_ID,`interest`) VALUES (3,'One Click DevOps');
INSERT INTO `interests` (TARGET_AUDIANCE_ID,`interest`) VALUES (3,'NoOps');

INSERT INTO `creative` (`header`,`description`,`url`, `image`, `platform_platform_id`) VALUES ('DevOps Made Easy','DOP SuperHero is where all DevOps is going to happen in the future, join the revolution today!','https://example.io','img2.jpg',3);

INSERT INTO `insight` (`impressions`,`clicks`,`website_visits`, `nanos_score`, `cost_per_click`, `click_through_rate`, `advanced_kpi1`, `advanced_kpi3`, `platform_platform_id`) 
VALUES (20436,420,376,0.99,0.013,3.9,3.9,0,3);




INSERT INTO `campaign` (`name`,`goal`,`total_budget`,`status`) VALUES ('Test Ad 2','Raise Awareness', 360, 'Ended');

INSERT INTO `platform` (`type`,`status`,`total_budget`, `remaining_budget`, `start_date`, `end_date`) VALUES ('Facebook','Ended',180, 12, 1530568800000, 1533901600000);

INSERT INTO CAMPAIGN_PLATFORM (`campaign_id`,`platform_id`) VALUES (2,4);

INSERT INTO `target_audiance` (`id`, `platform_platform_id`) VALUES (4,4);

INSERT INTO `languages` (TARGET_AUDIANCE_ID,`language`) VALUES (4,'EN');

INSERT INTO `genders` (TARGET_AUDIANCE_ID,`gender`) VALUES (4,'M');
INSERT INTO `genders` (TARGET_AUDIANCE_ID,`gender`) VALUES (4,'F');

INSERT INTO `age_range` (TARGET_AUDIANCE_ID,`age_range`) VALUES (4,20);
INSERT INTO `age_range` (TARGET_AUDIANCE_ID,`age_range`) VALUES (4,45);

INSERT INTO `locations` (TARGET_AUDIANCE_ID,`location`) VALUES (4,'Switzerland');

INSERT INTO `interests` (TARGET_AUDIANCE_ID,`interest`) VALUES (4,'Docker');
INSERT INTO `interests` (TARGET_AUDIANCE_ID,`interest`) VALUES (4,'Kubernates');
INSERT INTO `interests` (TARGET_AUDIANCE_ID,`interest`) VALUES (4,'DevOps');
INSERT INTO `interests` (TARGET_AUDIANCE_ID,`interest`) VALUES (4,'AWS');
INSERT INTO `interests` (TARGET_AUDIANCE_ID,`interest`) VALUES (4,'Google Cloud Platform');
INSERT INTO `interests` (TARGET_AUDIANCE_ID,`interest`) VALUES (4,'Ubuntu');

INSERT INTO `creative` (`header`,`description`,`url`, `image`, `platform_platform_id`) VALUES ('Tired of doing DevOps?','Let us our smart AI DevOps Assistant help you!','https://example.io','img4.jpg',4);

INSERT INTO `insight` (`impressions`,`clicks`,`website_visits`, `nanos_score`, `cost_per_click`, `click_through_rate`, `advanced_kpi1`, `advanced_kpi3`, `platform_platform_id`) 
VALUES (436,330,178,5.3,1.38,0.43,39,0.00143,4);



INSERT INTO `platform` (`type`,`status`,`total_budget`, `remaining_budget`, `start_date`, `end_date`) VALUES ('Instagram','Ended',180, 0, 1530568800000, 1533901600000);

INSERT INTO CAMPAIGN_PLATFORM (`campaign_id`,`platform_id`) VALUES (2,5);

INSERT INTO `target_audiance` (`id`, `platform_platform_id`) VALUES (5,5);

INSERT INTO `languages` (TARGET_AUDIANCE_ID,`language`) VALUES (5,'EN');

INSERT INTO `genders` (TARGET_AUDIANCE_ID,`gender`) VALUES (5,'M');
INSERT INTO `genders` (TARGET_AUDIANCE_ID,`gender`) VALUES (5,'F');

INSERT INTO `age_range` (TARGET_AUDIANCE_ID,`age_range`) VALUES (5,20);
INSERT INTO `age_range` (TARGET_AUDIANCE_ID,`age_range`) VALUES (5,45);

INSERT INTO `locations` (TARGET_AUDIANCE_ID,`location`) VALUES (5,'Switzerland');

INSERT INTO `interests` (TARGET_AUDIANCE_ID,`interest`) VALUES (5,'Docker');
INSERT INTO `interests` (TARGET_AUDIANCE_ID,`interest`) VALUES (5,'Kubernates');
INSERT INTO `interests` (TARGET_AUDIANCE_ID,`interest`) VALUES (5,'DevOps');
INSERT INTO `interests` (TARGET_AUDIANCE_ID,`interest`) VALUES (5,'AWS');
INSERT INTO `interests` (TARGET_AUDIANCE_ID,`interest`) VALUES (5,'Google Cloud Platform');
INSERT INTO `interests` (TARGET_AUDIANCE_ID,`interest`) VALUES (5,'Ubuntu');

INSERT INTO `creative` (`header`,`description`,`url`, `image`, `platform_platform_id`) VALUES ('Tired of doing DevOps?','Let us our smart AI DevOps Assistant help you!','https://example.io','img4.jpg',5);

INSERT INTO `insight` (`impressions`,`clicks`,`website_visits`, `nanos_score`, `cost_per_click`, `click_through_rate`, `advanced_kpi1`, `advanced_kpi3`, `platform_platform_id`) 
VALUES (436,330,178,5.3,1.38,0.43,39,0.00143,5);



