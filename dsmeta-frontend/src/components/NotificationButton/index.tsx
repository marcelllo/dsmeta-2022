import icon from "../../assets/img/notification-icon.svg";

import "./styles.css";
import axios from "axios";
import {BASE_URL} from "../../utils/request";

interface NotificationButtonProps {
    saleId: number;
}

function NotificationButton({ saleId }: NotificationButtonProps) {

    const handleClick = () => {
        axios.get(`${BASE_URL}/sales/${saleId}/notification`)
            .then(response => console.log('SUCESSO'));
    }

  return (
    <div className="dsmeta-red-btn" onClick={handleClick}>
      <img src={icon} alt="Notificar" title="Notificar" />
    </div>
  );
}

export default NotificationButton;
