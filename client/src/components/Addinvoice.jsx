import { useState } from "react";
import { Box, TextField, Typography,Button,styled } from "@mui/material";
import { saveInvoice } from "../services/api";

const Component=styled(Box)({
marginTop:20,
'&> p':{
    fontSize:26 ,
    marginBottom:10
},
'&> div>div':{
    marginRight:20,
    minWidth:200
}
})

const defaultObj={
  vendor:'',
  product :'',
  amount:0,
  date:'',
  action:'pending'

}

const AddInvoice = ({setAddInvoice}) => {

  const [invoice,setInvoice]=useState(defaultObj);

  const onValueChange=(e)=>{
      setInvoice({...invoice,[e.target.name]:e.target.value});
  }
const addNewInvoice= async () => {
   await saveInvoice({...invoice,amount: Number(invoice['amount'])});

   setAddInvoice(false);
}


  return (
    <Component>
      <Typography>Add Invoice</Typography>
      <Box>
        <TextField placeholder="Enter Vender Name" 
        onChange={(e)=> onValueChange(e)}
        name="vendor"
        autoComplete='off' //to off suggestion
        />
        <TextField placeholder="Enter Product Name" 
        onChange={(e)=> onValueChange(e)}
        name="product"
        autoComplete='off'
        />
        <TextField placeholder="Enter Amount (in Rs) " type="number" 
        onChange={(e)=> onValueChange(e)}
        name="amount"
        autoComplete='off'
        />
        <TextField placeholder="Enter Date"  type="date"
        onChange={(e)=> onValueChange(e)}
        name="date"
        autoComplete='off' 
        />
        <Button variant="contained" style={{padding:16}}
        onClick={()=>addNewInvoice()}
       
        >Submit</Button>
      </Box>
    </Component>
  )
};
export default AddInvoice;
