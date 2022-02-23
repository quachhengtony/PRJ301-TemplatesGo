# **TemplatesGo**
## Hassle-free Buying & Selling of High Quality Templates
TemplatesGo aims to provides an online marketplace with sleek interface for developers to quickly and easily buy and sell their website templates, connecting developers who is looking for a platform to sell their website templates online and developers who are looking to buy high quality templates for their projects or works.

## Team
- Quách Hêng Tô Ni (SE160076)
- Phạm Trọng Thành (SE160037)
- Huỳnh Minh Trung (SE151480)
- Phan Nhật Hoàng (SE150781)

## Users
Developers, designers, freelancers, and others in technology-related fields.

## Features
- Create accounts.
- View, edit and delete account.
- Login and logout.
- View, search, sort, filter templates.
##### Buyer:
- Add templates to cart.
- View, modify and delete cart items.
- Checkout.
- Feedback, report templates.
##### Seller:
- Includes all buyer's features.
- Submit templates to sell.
- View, edit, delete templates.
##### Admin:
- Review, approve reports.
- Search, delete sellers' templates.
- Ban users.

## Sitemap
![TemplatesGo Sitemap](/assets/sitemap/TemplatesGo_Sitemap.png)

## Wireframes

##### Home page:
![TemplatesGo Home](/assets/wireframes/TemplatesGo_Home.png)

##### Template details page:
![TemplatesGo Template Details](/assets/wireframes/TemplatesGo_TemplateDetails.jpg)

##### Cart page:
![TemplatesGo Cart](/assets/wireframes/TemplatesGo_Cart.png)

##### Checkout page:
![TemplatesGo Checkout](/assets/wireframes/TemplatesGo_Checkout.png)

##### Seller dashboard page (seller only):
![TemplatesGo Seller Dashboard](/assets/wireframes/TemplatesGo_SellerDashboard.jpg)

##### Submit template page (seller only):
![TemplatesGo Submit Template](/assets/wireframes/TemplatesGo_SubmitTemplate.png)

##### Account list page (admin only):
![TemplatesGo Admin Dashboard](/assets/wireframes/TemplatesGo_AccountList.jpg)

##### Review report page (admin only):
![TemplatesGo Admin Dashboard](/assets/wireframes/TemplatesGo_ReviewReport.jpg)

##### Account page:
![TemplatesGo Account](/assets/wireframes/TemplatesGo_Account.png)

##### Login page:
![TemplatesGo Login](/assets/wireframes/TemplatesGo_Login.jpg)

##### Register page:
![TemplatesGo Register](/assets/wireframes/TemplatesGo_Register.png)

## Database Design

##### Logical design
![TemplatesGo Logical Design Same Entities](/assets/database-designs/TemplatesGo_LogicalDesignSameEntities.png)

##### Logical design (with Buyer and Seller entities represented seperately from Account entity)
The Entity Relationship Diagram bellow shows how the entities will interact with eachothers.
![TemplatesGo Logical Design Without Admin](/assets/database-designs/TemplatesGo_LogicalDesignWithoutAdmin.jpg)

##### Logical design (with Buyer, Seller, and Admin entities represented seperately from Account entity)
The Entity Relationship Diagram bellow shows how Admin entity will interact with the rest of the system.
![TemplatesGo Logical Design With Admin](/assets/database-designs/TemplatesGo_LogicalDesignWithAdmin.jpg)

##### Physical design
The database diagram bellow shows how the system's logical design is implemented in a database. Buyer, Seller, and Admin entity only exists in the logical design to better represent how the system works, and these entities is grouped into one singular entity (Account entity) in the physical design.
![TemplatesGo Physical Design](/assets/database-designs/TemplatesGo_PhysicalDesign.jpg)

## System Design
- Naming convention: camel case.
- File naming convention: camel case.
- Indentation: indent once per nesting level using tab.
- PLacement of braces: Allman (BSD/Pascal).

##### Folder structures:
The images bellow show how the system is implemented using the MVC model.
| Plugin | Image |
| ------ | ------ |
| Controllers | ![TemplatesGo Controller](/assets/screenshots/TemplatesGo_Controllers.png) |
| Models | ![TemplatesGo Models](/assets/screenshots/TemplatesGo_Models.png) |
| Views | ![TemplatesGo Views](/assets/screenshots/TemplatesGo_Views.png) |


## License
MIT