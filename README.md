# Phonebook


# API
1. **Create Contact API**

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
2. **Read Contact API**

    API ini digunakan untuk mecari kontak

    Method
    ```api
    POST  : https://localhost:8080/V1.0/phonebook/read
    ```
    
    Request
    ```json
    {
        "name": "Re",
        "phoneNo": "081250470845"

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

3. **Update Contact API**

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
4. **Delete Contact API**

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