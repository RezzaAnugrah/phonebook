# Phonebook


# API

1. **Get List Contact API**

    API ini digunakan untuk melihat seluluh list phonebook

    Method
    ```api
    GET  : https://localhost:8080/V1.0/phonebook/
    ```

     Response
    ```json
    {
    "responseCode": "00",
    "responseMessage": "Success",
    "data": [
            {
                "id": 1,
                "phoneNo": "081250470845",
                "name": "Rezza",
                "email": "rezza@example.com"
            },
            {
                "id": 2,
                "phoneNo": "081250470846",
                "name": "Rendy",
                "email": "rendy@example.com"
            }
        ]
    }
    ```

2. **Create Contact API**

    API ini digunakan untuk menambah kontak baru

    Method
    ```api
    POST  : https://localhost:8080/V1.0/phonebook/add
    ```
    
    Request
    ```json
    {
        "name": "Rezza",
        "phoneNo": "081250470845",
        "email": "rezza@example.com"
    }
    ```

     Response
    ```json
    {
        "responseCode": "00",
        "responseMessage": "Success",
        "data": {
            "id": "01",
            "name": "Rezza",
            "phoneNo": "081250470845",
            "email": "rezza@example.com"
        }
    }
    ```
3. **Read Contact API**

    API ini digunakan untuk mecari kontak by Name

    Method
    ```api
    POST  : https://localhost:8080/V1.0/phonebook/read
    ```
    
    Request
    ```json
    {
        "name": "Re"
    }
    ```

    Response
    ```json
    {
        "responseCode": "00",
        "responseMessage": "Success",
        "data": [{
            "id": "Rezza",
            "name": "01",
            "phoneNo": "081250470845",
            "email": "rezza@example.com"
        },{
            "id": "02",
            "name": "Rendi",
            "phoneNo": "081234567890",
            "email": "rendi@example.com"
        },{
            "id": "03",
            "name": "Rezki",
            "phoneNo": "081234567891",
            "email": "rezki@example.com"
        }]
    }
    ```

4. **Update Contact API**

    API ini digunakan untuk mengupdate kontak

    Method
    ```api
    POST  : https://localhost:8080/V1.0/phonebook/update
    ```
    
    Request
    ```json
    {
        "id": "01",
        "name": "Rezza Mutiarawan",
        "phoneNo": "081250470845",
        "email": "rezza@example.com"
    }
    ```

     Response
    ```json
    {
        "responseCode": "00",
        "responseMessage": "Success",
        "data": {
            "id": "01",
            "name": "Rezza Mutiarawan",
            "phoneNo": "081250470845",
            "email": "rezza@example.com"
        }
    }
    ```
5. **Delete Contact API**

    API ini digunakan untuk menghapus kontak

    Method
    ```api
    POST  : https://localhost:8080/V1.0/phonebook/delete
    ```
    
    Request
    ```json
    {
        "id": "01",
        "name": "Rezza Mutiarawan",
        "phoneNo": "081250470845",
        "email": "rezza@example.com"
    }
    ```

     Response
    ```json
    {
        "responseCode": "00",
        "responseMessage": "Success"
    }
    ```

# FrontEnd
    
    https://github.com/RezzaAnugrah/phonebook-fe