/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  DaijobuDes
 * Created: 22 Feb 2021
 */

CREATE TABLE user_accounts (
    DATEANDTIME VARCHAR(64) NOT NULL,
    USERNAME VARCHAR(64) UNIQUE NOT NULL,
    PASSWORD_ VARCHAR(64) NOT NULL,
    PRIVILEGE INTEGER
)

INSERT INTO users_accounts VALUES ('1-1-1980', 'admin', 'admin', 1);
