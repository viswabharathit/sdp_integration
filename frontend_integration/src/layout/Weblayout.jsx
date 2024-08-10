import React from 'react'
import Navbar from '@/components/shared/Navbar';
import { Outlet } from 'react-router-dom';
import Footer from '@/components/shared/Footer';
const Weblayout = () => {
  return (
    <div>
         <Navbar/>
        <Outlet/>
        <Footer/>
    </div>
  )
}

export default Weblayout; 