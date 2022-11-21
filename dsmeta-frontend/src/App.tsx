import { ToastContainer } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';

import Header from "./components/Header";
import SalesCard from "./components/SalesCard";

function App() {
  return (
    <>
      <ToastContainer />
      <main>
        <section id="sales">
          <div className="dsmeta-container">
            <Header />
            <SalesCard />
          </div>
        </section>
      </main>
    </>
  );
}

export default App;
