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
- View and edit account.
- Login and logout.
- View, search, sort, filter templates.
##### Buyer:
- Add templates to cart.
- View, modify, delete cart items.
- Checkout.
- Report templates.
##### Seller:
- Submit templates to sell.
- View, edit, delete templates.
##### Admin:
- Review, approve reports.
- Search, delete sellers' templates.
- Manage categories.
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

##### Logical design (with Buyer, Seller, and Admin entities represented seperately from Account entity)
![TemplatesGo Logical Design](/assets/database-designs/TemplatesGo_LogicalDesign.png)

##### Physical design
The database diagram bellow shows how the system's logical design is implemented in the database. Buyer, Seller, and Admin entities only exist in the logical design to better represent how the system works, and these entities are grouped into one singular entity (Account entity) in the physical design.
![TemplatesGo Physical Design](/assets/database-designs/TemplatesGo_PhysicalDesign.jpg)

## System Design
- Naming convention: camel case.
- File naming convention: camel case for jsp files and pascal case for java files.
- Indentation: indent once per nesting level using tab.
- PLacement of braces: Allman (BSD/Pascal).

##### Folder structures:
The images bellow show how the system is implemented using the MVC model.
| Component | Image |
| ------ | ------ |
| Controllers | ![TemplatesGo Controller](/assets/screenshots/TemplatesGo_Controllers.png) |
| Models | ![TemplatesGo Models](/assets/screenshots/TemplatesGo_Models.png) |
| Views | ![TemplatesGo Views](/assets/screenshots/TemplatesGo_Views.png) |

## Conclusion
##### Pros
- Simple and straight-forward buying and selling experience.
- Truthful adaptation of the MVC pattern.
##### Cons
- Missing important features such as: forget password, notification, email verification, etc.
- Messy codebase.
##### What we've learned
- MVC pattern.
- File upload.
- Database paging.
- Design and implement a full-fledged web application from start to finish.
##### Possible future improvements
- Add missing features.
- Refactor methods and variables names.
- Improve database design.

## License
MIT