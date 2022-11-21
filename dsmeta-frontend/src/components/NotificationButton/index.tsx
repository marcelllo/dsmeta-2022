import icon from "../../assets/img/notification-icon.svg";

import "./styles.css";
import axios from "axios";
import {BASE_URL} from "../../utils/request";
import {toast} from "react-toastify";

interface NotificationButtonProps {
    saleId: number;
}

function NotificationButton({ saleId }: NotificationButtonProps) {

    const handleClick = () => {
        axios.get(`${BASE_URL}/sales/${saleId}/notification`)
            .then(response => toast.info('SMS enviado com sucesso'));
    }

  return (
    <div className="dsmeta-red-btn" onClick={handleClick}>
      <img src={icon} alt="Notificar" title="Notificar" />
    </div>
  );
}

export default NotificationButton;
