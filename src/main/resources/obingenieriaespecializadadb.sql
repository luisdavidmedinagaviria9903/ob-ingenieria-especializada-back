create table component
(
    id_component      int auto_increment
        primary key,
    cmp_type          int(2)                           not null,
    cmp_eq            varchar(255)                     null,
    cmp_creation_date datetime     default sysdate()   null,
    cmp_creation_user varchar(100) default 'Automatic' null,
    cmp_status        int          default 0           null,
    constraint component_id_component_uindex
        unique (id_component)
);

create table component_entry
(
    id_component_entry    int auto_increment
        primary key,
    cmp_entry_observation longtext null,
    id_component          int      not null,
    id_client             int      null,
    constraint component_entry_id_component_entry_uindex
        unique (id_component_entry),
    constraint component_entry_component_id_component_fk
        foreign key (id_component) references component (id_component)
);

create table component_entry_inventory
(
    id_component_entry_inventory int auto_increment
        primary key,
    id_cmp_entry                 int           not null,
    cmp_entry_invrty_code        varchar(100)  not null,
    cmp_entry_invrty_value       varchar(255)  null,
    cmp_entry_invrty_status      int default 1 null,
    constraint component_entry_inventory_id_component_entry_inventory_uindex
        unique (id_component_entry_inventory)
);

create table component_evaluation
(
    id_component_evaluation int auto_increment
        primary key,
    constraint component_evaluation_id_component_evaluation_uindex
        unique (id_component_evaluation)
);

create table component_pictures
(
    id_component_pictures int auto_increment
        primary key,
    constraint component_pictures_id_component_pictures_uindex
        unique (id_component_pictures)
);

create table inventory
(
    id_inventory int auto_increment
        primary key,
    constraint inventory_id_inventory_uindex
        unique (id_inventory)
);

create table misc_type
(
    id_misc_type int auto_increment
        primary key,
    constraint misc_type_id_misc_type_uindex
        unique (id_misc_type)
);

create table quotation
(
    id_quotation int auto_increment
        primary key,
    constraint quotation_id_quotation_uindex
        unique (id_quotation)
);

create table rol
(
    id_rol int auto_increment
        primary key,
    constraint rol_id_rol_uindex
        unique (id_rol)
);

create table user
(
    id_user          int auto_increment
        primary key,
    email            varchar(255) null,
    user_first_name  varchar(255) null,
    user_second_name varchar(255) null,
    user_document    varchar(255) null,
    document_type    int          null,
    phone            int          null,
    constraint user_id_user_uindex
        unique (id_user)
);


