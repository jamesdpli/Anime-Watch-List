import './Footer.css';

// need to add more footer ---- not nice looking

const Footer = () => {
    return(
        <footer id="footer">
        <div id="footer-left-side">
            <p className="random-words">
            Corporis ut aliquid qui molestiae. Sed laborum sunt recusandae
            animi dolore voluptates.
            </p>
            <p className="random-words3">©2022 All rights reserved</p>
        </div>

        <ul className="extra-info">
            <h3>Product</h3> 
            <li>
            <a href="#" target="_blank">Download</a></li>
            <br/>
            
            <li><a target="blank" href="#">Pricing</a></li>
            <br/>

            <li><a target="blank" href="#">Locations</a></li>
            <br/>

            <li><a target="blank" href="#">Server</a></li>
            <br/>

            <li>
            <a target="blank" href="#">Countries</a></li>
            <br/>

            <li><a target="blank" href="#">Blog</a></li>
        </ul>

        <ul className="extra-info">
            <h3>Company</h3>

            <li>
            <a target="blank" href="#">
                FAQ
            </a>
            </li>
            <br/>

            <li>
            <a target="blank" href="#">
                Tutorials
            </a>
            </li>
            <br/>

            <li>
            <a target="blank" href="#">
                About Us
            </a>
            </li>
            <br/>

            <li>
            <a target="blank" href="#">
                Careers
            </a>
            </li>
            <br/>

            <li>
            <a target="blank" href="#">
                Support
            </a>
            </li>
            <br/>
        </ul>

        <ul className="extra-info">
            <h3>Privacy</h3>

            <li>
            <a target="blank" href="#">
                Privacy
            </a>
            </li>
            <br/>

            <li>
            <a target="blank" href="#">
                Terms of Use
            </a>
            </li>
            <br/>

            <li>
            <a target="blank" href="#">
                Site map
            </a>
            </li>
        </ul>
    </footer>
        )
}   

export default Footer