drop table if exists tutorials;
create table tutorials (
id number(10) not null,
title varchar2(99) not null,
description varchar2(200),
published boolean
);